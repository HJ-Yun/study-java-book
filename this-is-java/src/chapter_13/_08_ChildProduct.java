package chapter_13;

public class _08_ChildProduct<T,M,C> extends _08_Product<T,M>{
    private C company;
    public void setCompany(C company){
        this.company = company;
    }

    public C getCompany(){
        return company;
    }
}
