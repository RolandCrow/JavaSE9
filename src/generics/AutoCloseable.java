package generics;

import java.util.ArrayList;
;

public class AutoCloseable {

    public static <T extends AutoCloseable & Runnable> void closeAll(ArrayList<?> elements) throws Exception {
       /* for(T elem: elements) elem.close; */
    }
}
