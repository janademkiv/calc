import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;


public class Arabic extends Calc {
    @Override
    protected int strToInt(String s) {
            return Integer.parseInt(s);

    }

    @Override
    protected String intToStr(int s) {
        return String.valueOf(s);
    }
}
