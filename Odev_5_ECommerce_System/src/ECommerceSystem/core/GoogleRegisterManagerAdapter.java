package ECommerceSystem.core;

import ECommerceSystem.Google.GoogleManager;

public class GoogleRegisterManagerAdapter implements EmailCheckService {
    @Override
    public void checkSystem(String email) {
        GoogleManager googleManager =new GoogleManager();
        googleManager.register(email);
    }
}
