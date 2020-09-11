package behavioural.chainOfResponsibility;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainOfResponsibilityTest {
    private static AuthenticationProcessor getChainOfAuthProcessor(){
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }

    @Test
    public void givenOAuthProvider_whenCheckingAuthorized_thenTrue(){
        AuthenticationProcessor processor = getChainOfAuthProcessor();
        assertTrue(processor.isAuthorized(new OAuthTokenProvider()));
    }

    @Test
    public void givenOAuthProvider_whenCheckingAuthorized_thenFalse(){
        AuthenticationProcessor processor = getChainOfAuthProcessor();
        assertFalse(processor.isAuthorized(new TestAuthenticationProvider()));
    }
}

