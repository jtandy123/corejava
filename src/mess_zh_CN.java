import java.util.ListResourceBundle;

public class mess_zh_CN extends ListResourceBundle {
    private final Object[][] myData = {
            {"msg", "{0}, 日期是{1}"},
            {"test", "class测试"}
    };

    @Override
    protected Object[][] getContents() {
        return myData;
    }
}
