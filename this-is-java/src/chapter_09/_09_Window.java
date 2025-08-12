package chapter_09;

public class _09_Window {
    _09_Button button1 = new _09_Button();
    _09_Button button2 = new _09_Button();

    _09_Button.OnclickListener listener = new _09_Button.OnclickListener() {
        @Override
        public void onClick() {
            System.out.println("Calling");
        }
    };

    _09_Window(){
        button1.setOnClickListener(listener);
        button2.setOnClickListener(new _09_Button.OnclickListener() {
            @Override
            public void onClick() {
                System.out.println("Send the message");
            }
        });
    }
}
