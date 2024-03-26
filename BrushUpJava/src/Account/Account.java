package Account;

public class Account {
    String name;

    public Account(String name)
    {
        if(name == null)
        {
            this.name = "Default Name";
        }else {
            this.name = name;
        }
    }
    public String getName() {
       return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
