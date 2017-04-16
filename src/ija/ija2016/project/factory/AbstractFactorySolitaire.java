package ija.ija2016.project.factory;

import ija.ija2016.project.model.cards.Card;
import ija.ija2016.project.model.cards.CardDeck;
import ija.ija2016.project.model.cards.CardStack;

import ija.ija2016.project.model.cards.CardClass;
import ija.ija2016.project.model.cards.CardDeckClass;
import ija.ija2016.project.model.cards.CardStackClass;

public abstract class AbstractFactorySolitaire extends java.lang.Object {
    public abstract CardDeck createCardDeck();

    public abstract Card createCard(Card.Color color, int value);

    public abstract CardDeck createTargetPack(Card.Color color);

    public abstract CardStack createWorkingPack();
}
