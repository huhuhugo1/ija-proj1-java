package ija.ija2016.project.model.cards;
import ija.ija2016.project.model.cards.Card;
import ija.ija2016.project.model.cards.CardStack;

public class WorkingCardStackClass extends CardStackClass
{
	Card.Color color;

	public WorkingCardStackClass(int size) {
		super(size);
        top = 0;
    }

	public boolean put(Card card) {
        if (top == pack.length)
            return false;

        if (top == 0) {
            if (card.value() != 13)
                return false;
        } else {
            if ((pack[top-1].value() - 1) != card.value())
                return false;
        
            if (card.similarColorTo(pack[top-1].color()))
                return false;
        }

		pack[top] = card;
        top++;

		return true;
	}

    public boolean put(CardStack pack) {
        
        if (top + pack.size() >= this.pack.length)
            return false;

        Card card = ((CardStackClass) pack).pack[0];

        if (top == 0) {
            if (card.value() != 13)
                return false;
        } else {
            if ((this.pack[top-1].value() - 1) != card.value())
                return false;
        
            if (card.similarColorTo(this.pack[top-1].color()))
                return false;
        }
        
        System.arraycopy(((CardStackClass)pack).pack, 0, this.pack, top, pack.size());
        top += pack.size();
        return true;     
    }
}
