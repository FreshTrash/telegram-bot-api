import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Created by Maksim on 02.09.2016.
 */
public abstract class TelegramBot {
    final protected String TELEGRAM_URL;
    protected CloseableHttpClient httpClient = HttpClients.createDefault();

    private TelegramBot() {
        TELEGRAM_URL = "";
    }

    public TelegramBot(String token) {
        if (!token.startsWith("bot")) {
            token = "bot" + token;
        }
        TELEGRAM_URL = "https://api.telegram.org/" + token + "/";
    }

    abstract String getMe();
}
