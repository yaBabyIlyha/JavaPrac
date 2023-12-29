public class HumanTest {
    public static void main(String[] args){
        Head head = new Head("Блондинистые", 60);
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(60);
        Hand rightHand = new Hand(60);

        Human human = new Human(head, rightLeg, leftLeg, rightHand, leftHand);
        human.Describe();
    }
}
