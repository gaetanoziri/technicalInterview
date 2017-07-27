package com.xacria.interview.algorithm;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by fre on 18/07/17.
 */
public class MorseCodeDecoderTest extends Assert {

    @Test
    public void testBasicMorseDecoding() {
        assertThat(MorseCodeDecoder.decode(".-"), is("A"));
        assertThat(MorseCodeDecoder.decode("."), is("E"));
        assertThat(MorseCodeDecoder.decode(".."), is("I"));
        assertThat(MorseCodeDecoder.decode(". ."), is("EE"));
        assertThat(MorseCodeDecoder.decode(".   ."), is("E E"));
        assertThat(MorseCodeDecoder.decode("... --- ..."), is("SOS"));
        assertThat(MorseCodeDecoder.decode("...   ---   ..."), is("S O S"));
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }

    @Test
    public void testMoreComplexTests() {
        assertThat(MorseCodeDecoder.decode(" . "), is("E"));
        assertThat(MorseCodeDecoder.decode("   .   . "), is("E E"));
//        assertThat(MorseCodeDecoder.decode("      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  "), is("SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
    }
}
