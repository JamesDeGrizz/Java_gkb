package java_advanced.lesson_7.server;

public interface AuthService {
    void start();

    String getNickByLoginPass(String login, String pass);

    void stop();
}
