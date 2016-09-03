import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by Maksim on 02.09.2016.
 */
public class TelegramBotImpl extends TelegramBot {

    private TelegramBotImpl(String token) {
        super(token);
    }

    public static TelegramBotImpl getBot(String token) {
        return new TelegramBotImpl(token);
    }

    @Override
    String getMe() {
        HttpGet get = new HttpGet(TELEGRAM_URL + "getMe");
        try {
            CloseableHttpResponse response = httpClient.execute(get);
            return IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;

        }

    }

}
