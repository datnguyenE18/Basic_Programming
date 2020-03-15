#include <string>
#include <algorithm>
#include <iostream>
int main()
{
    std::string s;
    std::cout << "Nhap chuoi: ";
    std::cin >> s;
    if( equal(s.begin(), s.begin() + s.size()/2, s.rbegin()) )
        std::cout << "True\n";
    else
        std::cout << "False\n";
}
