package behavioural.chainOfResponsibility;

public class OAuthProcessor extends AuthenticationProcessor {

    public OAuthProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
        if (authenticationProvider instanceof OAuthTokenProvider) {
            return true;
        } else if (nextAuthenticationProcessor != null) {
            return nextAuthenticationProcessor.isAuthorized(authenticationProvider);
        }

        return false;
    }
}
