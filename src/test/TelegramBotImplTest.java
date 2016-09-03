import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Maksim on 02.09.2016.
 */
public class TelegramBotImplTest {
    TelegramBot bot;
    @Before
    public void setUp() throws Exception {
         bot = TelegramBotImpl.getBot("231461396:AAHGVa5P7C_v9NREi9X6wg_bCF_7p7RTehE");
    }

    @Test
    public void getMe() throws Exception {
        Assert.assertEquals(bot.getMe(), "test");
    }

}