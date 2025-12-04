class Node:
    def __init__(self,data):
        self.data=data
        self.next=None  #Address of next node

class SSL:
    def __init__(self):
        self.head=None

    def insertion_At_Begining(self,data):
        nb=Node(data)
        nb.next=self.head
        self.head=nb

    def insertion_At_End(self,data):
        ne=Node(data)
        temp=self.head
        while temp.next:
            temp=temp.next
        temp.next=ne

    def insertion_At_Position(self,pos,data):
        np=Node(data)
        temp=self.head
        for i in range(pos-1):
            temp=temp.next
        np.data=data
        np.next=temp.next
        temp.next=np

    def deletion_begining(self):
        temp=self.head
        self.head=temp.next
        temp=None

    def deletion_End(self):
        prev=self.head
        temp=self.head.next
        while temp.next is not None:
            temp=temp.next
            prev=prev.next
        prev.next=None

    def deletion_postion(self,pos):
        prev=self.head
        temp=self.head.next
        for i in range(1,pos-1):
            temp=temp.next
            prev=prev.next
        prev.next=temp.next

    def display(self):
        if self.head is None:
            print("linked list is Empty")
        else:
            temp=self.head
            while temp:
                print(temp.data,"-->",end=" ")
                temp=temp.next

L=SSL()
n1=Node(10)
L.head=n1
n2=Node(20)
L.head.next=n2
n3=Node(30)
n2.next=n3
n4=Node(40)
n3.next=n4
n5=Node(50)
n4.next=n5

L.insertion_At_Begining(5)
L.insertion_At_Position(4,35)
L.insertion_At_End(60)

L.deletion_begining()
L.deletion_End()
L.deletion_postion(4)

L.display()
