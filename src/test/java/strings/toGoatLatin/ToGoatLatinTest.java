package strings.toGoatLatin;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class ToGoatLatinTest {
    private String englishPhrase;
    private String expected;
    private Solution solution;

    public ToGoatLatinTest(String englishPhrase, String expected) {
        this.englishPhrase = englishPhrase;
        this.expected = expected;
    }

    @Parameters(name = "{index}: toGoatLatin(\"{0}\") = \"{1}\"")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"I speak Goat Latin", "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"},
                {"The quick brown fox jumped over the lazy dog", "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"},
                {"Each word consists of lowercase and uppercase letters only", "Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa"},
        });
    }

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void toGoatLatinSuite() {
        String goatPhrase = solution.toGoatLatin(englishPhrase);
        assertThat(goatPhrase, is(equalTo(expected)));
    }
}