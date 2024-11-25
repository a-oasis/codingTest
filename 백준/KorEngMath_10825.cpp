#include <iostream>
#include <queue>
using namespace std;

struct Person{
    string name;
    int kor,eng,math;

    bool operator<(const Person& other) const{
        if(kor !=other.kor) return kor<other.kor;
        else if(eng != other.eng) return eng>other.eng;
        else if(math != other.math) return math<other.math;
        else return name>other.name;
    }
};

int main(){
    int N;
    cin>>N;

    priority_queue<Person> pq;

    for(int i=0;i<N;i++){
        Person person;
        cin>>person.name>>person.kor>>person.eng>>person.math;
        pq.push(person);
    }

    while( !pq.empty()){
        cout << pq.top().name<<"\n";
        pq.pop();
    }
}