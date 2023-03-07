import random

card = ['Ace❤️','2❤️','3❤️', '4❤️', '5❤️', '6❤️', '7❤️', '8❤️', '9❤️', '10❤️', 'Jack❤️', 'Queen❤️', 'King❤️',
        'Ace♣️','2♣️','3♣️', '4♣️', '5♣️', '6♣️', '7♣️', '8♣️', '9♣️', '10♣️', 'Jack♣️', 'Queen♣️', 'King♣️',
        'Ace♠️','2♠️','3♠️', '4♠️', '5♠️', '6♠️', '7♠️', '8♠️', '9♠️', '10♠️', 'Jack♠️', 'Queen♠️', 'King♠️',
        'Ace♦️','2♦️','3♦️', '4♦️', '5♦️', '6♦️', '7♦️', '8♦️', '9♦️', '10♦️', 'Jack♦️', 'Queen♦️', 'King♦️',
        'Joker1','Joker2']
card_drawm=[]

def remove_joker():
    card.remove('Joker1')
    card.remove('Joker2')
    print("Joker Is Remove")

def shuffle():
    random.shuffle(card)
    '''n = len(card)
    for i in range(n-1,0,-1):
        j = random.randint(0,i + 1)
        card[i],card[j] = card [j],card[i]
        '''
    print("Shuffled Card",card)

def draw():
    Draw = random.sample(card,5)
    card_drawm.append(Draw)
    print("\n\n\n Draw Card : ",card_drawm)

def new_deck():
    random.shuffle(card)
    print("\n\n\n New Deck : ",card)

def display_deck():
    print("\n\n\n Deck : ",card)

if __name__ == "__main__":
    while True:
        print("DECK\nChoose What To Do\n1.)Display Deck\n2.)Remove Joker\n3.)Shuffle Deck\n4.)Draw Card\n5.)New Deck")
        c = input("Command : ")
        try:
            if c == "1":
                display_deck()
            elif c == "2":
                remove_joker()
            elif c == "3":
                shuffle()
            elif c == "4":
                draw()
            elif c == "5":
                new_deck()
        except:
            print("Error Command!!")