package behavioural.chainOfResponsibility;

import static java.util.Objects.isNull;

public class UsernamePasswordProcessor extends AuthenticationProcessor {

    public UsernamePasswordProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
        if (authenticationProvider instanceof UsernamePasswordProvider) {
            return true;
        } else if (!isNull(nextAuthenticationProcessor)) {
            return nextAuthenticationProcessor.isAuthorized(authenticationProvider);
        }

        return false;
    }
}
