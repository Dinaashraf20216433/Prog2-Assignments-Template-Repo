//Dina Ashraf
//20216433	

#include <iostream>
using namespace std;

int main() {
    int a;
    cin >> a;

    
    while (a >= 10) {
        a /= 10;
    }

    if (a % 2 == 0) {
        cout << "EVEN";
    } else {
        cout << "ODD";
    }

    return 0;
}
