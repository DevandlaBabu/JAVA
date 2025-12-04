class Node:
    def __init__(self,data):
        self.data=data
        self.prev=None
        self.next=None

class doubleLL:
    def __init__(self):
        self.head=None

    def insertion_begining(self,data):
        nb=Node(data)
        temp=self.head
        temp.prev=nb
        nb.next=temp
        self.head=nb
    def insertion_end(self,data):
        ne=Node(data)
        temp=self.head
        while temp.next is not None:
            temp=temp.next
        temp.next=ne
        ne.prev=temp

    def insertion_position(self,data,pos):
        np=Node(data)
        temp=self.head
        for i in range(1,pos-1):
            temp=temp.next
        np.prev=temp
        np.next=temp.next
        temp.next=np
        temp.next.prev=np

    def deletion_begining(self):
        temp=self.head
        self.head=temp.next
        temp.next=None
        self.head.prev=None

    def deletion_end(self):
        temp=self.head.next
        before=self.head
        while temp.next is not None:
            temp=temp.next
            before=before.next
        before.next=None
        temp.prev=None

    def deletion_position(self,pos,data):
        temp=self.head.next
        before=self.head
        for i in range(1,pos-1):
            temp=temp.next
            before=before.next
        before.next=temp.next
        temp.next.prev=before
        temp.prev=None
        temp.next=None


    def display(self):
        if self.head is None:
            print("empty")
        else:
            temp=self.head
            while temp:
                print(temp.data,"-->",end=" ")
                temp=temp.next

L=doubleLL()

n=Node(10)
L.head=n
n1=Node(20)
n.next=n1
n1.prev=n
n2=Node(30)
n1.next=n2
n2.prev=n1
n3=Node(40)
n2.next=n3
n3.prev=n2

L.insertion_position(25,3)
L.insertion_end(50)
L.insertion_begining(5)

#L.deletion_begining()
#L.deletion_end()
L.deletion_position(3,25)
L.display()