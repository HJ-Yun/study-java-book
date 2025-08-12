package chapter_09;

public class _09_Button {
    interface OnclickListener{
        void onClick();
    }
    OnclickListener listener;
    void setOnClickListener(OnclickListener listener){
        this.listener = listener;
    }
    void touch(){
        listener.onClick();
    }
}
