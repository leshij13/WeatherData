/**
 * Created by pc on 26.02.2017.
 */
public interface Subject {
   public void registerObserver(Observer o);
   public void removeObserver(Observer o);
   public void notifyObserver();
}
