#include <iostream> 
#include <list> 
using namespace std; 
  
int main() 
{ 
    list<int> mylist{ 1, 2, 3, 4, 5 }; 
    mylist.push_front(6);                                         //auto is a default storage classss for all variable declared inside a f                                                                 //function or a block.
    for (auto it = mylist.begin(); it != mylist.end(); ++it) 
        cout << ' ' << *it; 
} 

