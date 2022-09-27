package cc.buckler.dnf.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;

@Slf4j
public class CharSetUtil {
    public static String convertCharset(String s) {
        if (s != null) {
            try {
                int length = s.length();
                byte[] buffer = new byte[length];
                // 0x81 to Unicode 0x0081, 0x8d to 0x008d, 0x8f to 0x008f, 0x90
                // to 0x0090, and 0x9d to 0x009d.
                for (int i = 0; i < length; ++i) {
                    char c = s.charAt(i);
                    if (c == 0x0081) {
                        buffer[i] = (byte) 0x81;
                    } else if (c == 0x008d) {
                        buffer[i] = (byte) 0x8d;
                    } else if (c == 0x008f) {
                        buffer[i] = (byte) 0x8f;
                    } else if (c == 0x0090) {
                        buffer[i] = (byte) 0x90;
                    } else if (c == 0x009d) {
                        buffer[i] = (byte) 0x9d;
                    } else {
                        buffer[i] = Character.toString(c).getBytes("CP1252")[0];
                    }
                }
                String result = new String(buffer, "UTF-8");
                return result;
            } catch (UnsupportedEncodingException e) {
                log.error(e.toString());
            }
        }
        return null;
    }

    public static String utf82Latin1(String str) {
        try {
            return new String(str.getBytes(), "ISO8859_1");
        } catch (UnsupportedEncodingException e) {
            log.error(e.toString());
        }
        return null;
    }
}
