public interface Ursidae{

  // This interface is trying to be all Bears to all people.
  // It really needs broken up into multiple smaller interfaces, otherwise it's not much use.
  // and it certainly breaks the interface segregation principle, by forcing the implementation of methods that are extremely unlikely to be used.

  public String sleep();
  public void eat(Edible food);

}