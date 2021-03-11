
public abstract class Figura implements Comparable<Figura>{

    public Figura()
    {

    }

    public abstract double area();
    public int compareTo(Figura f)
    {
        if(this.area()-f.area()>0)
        {
            return -1;
        }
        else if(this.area()-f.area()<0)
        {
            return 1;
        }
        return 0;
    }
}
