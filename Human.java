public class Human extends Actor{

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
        
    }

    @Override
    public void setTakeOrder() {
    isTakeOrder = true;
        
    }
    
    
   /*    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
 */
   
    @Override
    public String toString() {
        return "[Имя = " + name + ", Заказ принят = " + isMakeOrder + ", Заказ выдан = " + isTakeOrder + "]";
    }
    
   
}
