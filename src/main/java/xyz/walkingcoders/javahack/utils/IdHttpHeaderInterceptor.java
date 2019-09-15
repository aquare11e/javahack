package xyz.walkingcoders.javahack.utils;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xyz.walkingcoders.javahack.db.Client;
import xyz.walkingcoders.javahack.exception.NotAuthenticatedException;
import xyz.walkingcoders.javahack.repositories.ClientRepository;
import xyz.walkingcoders.javahack.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class IdHttpHeaderInterceptor implements HandlerInterceptor {

    private final static String USER_ID_HEADER = "user_id";

    private final ClientRepository clientRepository;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String header = request.getHeader(USER_ID_HEADER);
        if (header == null) {
            throw new NotAuthenticatedException("No user_id header received");
        }

        Long id;
        try {
            id = Long.valueOf(header);
        } catch (NumberFormatException e) {
            throw new NotAuthenticatedException("user_id header has incorrect format");
        }

        Optional<Client> clientOptional = clientRepository.findById(id);
        if (!clientOptional.isPresent()) {
            throw new NotAuthenticatedException("User with received header was not found");
        }

        UserService.setClient(clientOptional.get());
        return true;
    }

    @Override
    public void postHandle(
        HttpServletRequest request,
        HttpServletResponse response,
        Object handler,
        ModelAndView modelAndView
    ) {
        UserService.setClient(null);
    }
}
