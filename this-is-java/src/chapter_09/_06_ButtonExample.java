package chapter_09;

public class _06_ButtonExample {
    public static void main(String[] args) {
        _06_Button myButton = new _06_Button();

        myButton.setOnClickListener(new _06_CallListener());
        myButton.touch();

        myButton.setOnClickListener(new _06_MessageListener());
        myButton.touch();
    }
}
