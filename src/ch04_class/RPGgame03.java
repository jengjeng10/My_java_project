package ch04_class;

public class RPGgame03 {

    private String name ;

    void setName (String name){
        this.name = name ;
    }

    public String getName (){

        return name;
    }

    private String job ;

    void setJob (String job){
        this.job = job ;
    }

    public String getJob (){
        return job ;
    }

    private int Str , Dex , Con;

    void setStr(int Str){
        this.Str = Str ;

    }

    void setDex(int Dex){
        this.Dex = Dex ;

    }

    void setCon(int Con){
        this.Con = Con ;

    }

    public int getStr(){

    return Str;
    }
    public int getDex(){

    return Dex;
    }
    public int getCon(){

    return Con;
    }





}
