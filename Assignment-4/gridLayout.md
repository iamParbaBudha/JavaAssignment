# Java CardLayout

The CardLayout class manages the components in such a manner that only one component is visible at a time. It treats each component as a card that is why it is known as CardLayout.

## Constructors of CardLayout class
1.CardLayout(): creates a card layout with zero horizontal and vertical gap.
2.CardLayout(int hgap, int vgap): creates a card layout with the given horizontal and vertical gap.


### Commonly used methods of CardLayout class
1.public void next(Container parent): is used to flip to the next card of the given container.
2.public void previous(Container parent): is used to flip to the previous card of the given container.
3.public void first(Container parent): is used to flip to the first card of the given container.
4.public void last(Container parent): is used to flip to the last card of the given container.
5.public void show(Container parent, String name): is used to flip to the specified card with the given name.
