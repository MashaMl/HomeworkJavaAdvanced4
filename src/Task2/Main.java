package Task2;

import org.w3c.dom.ls.LSOutput;

import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str1 = "Містер і місіс Дурслі, що жили в будинку номер чотири на вуличці " +
                "\nПрівіт-драйв, пишалися тим, що були, слава Богу, абсолютно нормальними. " +
                "\nКого-кого, але тільки не їх можна було б запідозрити, що вони пов'язані з " +
                "\nтаємницями чи дивами, бо такими дурницями вони не цікавилися.\n" +
                "\n" +
                "\nМістер Дурслі керував фірмою \"Ґраннінґс\", яка виготовляла свердла. " +
                "\nТо був такий дебелий чолов'яга, що, здається, й шиї не мав, зате його обличчя " +
                "\nприкрашали пишні вуса. Натомість місіс Дурслі була худорлява, білява, а її " +
                "\nшия була майже вдвічі довша, ніж у звичайних людей, і це ставало їй у великій " +
                "\nпригоді: надто вже вона полюбляла зазирати через паркан, підглядаючи за сусідами. " +
                "\nПодружжя Дурслі мало синочка Дадлі, що був, на думку батьків, найкращим у світі.";

        Pattern pattern = Pattern.compile("(\sв\s)|(\sу\s)|(\sз\s)|(\sна\s)|(\sдо\s)|" +
                "(\sвід\s)|(\sпід\s)|(\sнад\s)|(\sза\s)|(\sкрізь\s)|(\sчерез\s)|(\sпри\s)|" +
                "(\sперед\s)|(\sпоза\s)|(\sз-за\s)|(\sбіля\s)|(\sобабіч\s)|(\sколо\s)|" +
                "(\sпо)\s|(\sза\s)|(\sпідчас\s)|(\sперед\s)|(\sпісля\s)|(\sо(об)\s)|" +
                "(\sупродовж\s)|(\sчерез\s)|(\sдо\s)|(\sнапередодні\s)|(\sчерез\s)|" +
                "(\sвід\s)|(\sз\s)|(\sзавдяки\s)|(\sза\s)|(\sвнаслідок\s)|(\sзнагоди\s)|" +
                "(\sзприводу\s)|(\sурезультаті\s)|(\sзогляду\s)|(\sдля\s)|(\sзадля\s)|" +
                "(\sзаради\s)|(\sна\s)|(\sпо\s)|(\sза\s)|(\sвім’я\s)|(\sзметою\s)|" +
                "(\sпри\s)|(\sза\s)|(\sуразі\s)|(\sнавипадок;всупереч\s)|(\sнаперекір\s)|" +
                "(\sнезважаючина\s)|(\sпо\s)|(\sз\s)|(\sза\s)|(\sчерез\s)|(\sзадопомогою\s)|" +
                "(\sдо\s)|(\sколо\s)|(\sблизько\s)|(\sна\s)|(\sбез\s)|(\sдля\s)|(\sвід\s)|" +
                "(\sз\s)|(\sпро\s)|(\sдо\s)|(\sвід\s)|(\sпри\s)|(\sза\s)");


        String str = pattern.matcher(str1).replaceAll(" Java ");
        System.out.println(str);

    }
}
