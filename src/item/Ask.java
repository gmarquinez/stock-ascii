package src.craptocraft.main.item;

public class Ask implements Offer {

    private String size = "";
    private int ask = 0;

    public Ask(String size, int ask){
        this.size = size;
        this.ask = ask;
    }


@Override
public String size();{
    return this.size;
}

@Override
public int value(){
    return this.value;
}

@Override
public int compareTo(Oftter ask){
    return this.ask.compareTo(ask.value());
}

@Override
public String tostring(){
    return "\t\t" + this.size() + "\t" + this.value() + "\n";
}

}


