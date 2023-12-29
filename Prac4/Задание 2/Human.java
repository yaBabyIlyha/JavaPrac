public class Human {
    private Head head;
    private Leg rightLeg;
    private Leg leftLeg;
    private Hand rightHand;
    private Hand leftHand;

    public Human(Head head, Leg rightLeg, Leg leftLeg, Hand rightHand, Hand leftHand){
        this.head = head;
        this.rightHand = rightHand;
        this.leftHand = leftHand;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }

    public void Describe(){
        System.out.println("Характеристики:");
        System.out.println("Голова: " + head.getHairColor() + " " + head.getHeadSize());
        System.out.println("Левая нога: " + leftLeg.getLegLenght());
        System.out.println("Правая нога: " + rightLeg.getLegLenght());
        System.out.println("Левая рука: " + leftHand.getHandLenght());
        System.out.println("Правая рука: " + rightHand.getHandLenght());
    }
}
