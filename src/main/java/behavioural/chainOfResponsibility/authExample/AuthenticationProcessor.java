package behavioural.chainOfResponsibility.authExample;

public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextAuthenticationProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        this.nextAuthenticationProcessor = nextAuthenticationProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authenticationProvider);
}
