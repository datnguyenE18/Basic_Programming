#include<iostream>
#include<cstdint> 
using namespace std;
#define MY_VALUE1 100 // Định nghĩa Marco
#define MY_VALUE2 5.6 // Định nghĩa Marco


int main () {
	//Khai báo:
	int a;
	double b;
	int8_t c; //8 bits
	uint16_t d; //16 bits
	uint16_t value = MY_VALUE1;

	//Độ lớn:
	cout << "\nint: " << sizeof( a );
	cout << "\nDouble: " << sizeof( b );
	cout << "\nint8_t: " << sizeof( c ); // 1 byte = 8 bits
 	cout << "\nuint16_t: " << sizeof( d );// 16 bits = 16/8 = 2 bytes 
	cout << "\nMY_VALUE1: " << sizeof( MY_VALUE1 );
	cout << "\nMY_VALUE2: " << sizeof( MY_VALUE2 );


	//Độ rộng - Marco sẵn trong thư viện:
	cout << "\n\nMinimum value of uint8_t = " << INT8_MIN ;
	cout << "\nMaximum value of uint8_t = " << INT8_MAX;
	cout << "\nMinimum value of int = " << INT_MIN;
	cout << "\nMaximum value of int = " << INT_MAX;

	system ( "pause" );
	return 0;
}

//Một số kiểu dữ liệu số nguyên thông dụng trong thư viện cstdint

//	Name						Type													Range
// int8_t 					1 byte signed										   - 128 to 127
// uint8_t					1 byte unsigned										       0 to 255
// int16_t					2 bytes signed										 - 32768 to 32767
// uint16_t					2 bytes unsigned										   0 to 65535
// int32_t					4 bytes signed									- 2147483648 to 2147483647
// uint32_t					4 bytes unsigned										   0 to 4294967295
// int64_t					8 bytes signed						   - 9223372036854775808 to 9223372036854775807
// uint64_t					8 bytes unsigned									   	   0 to 18446744073709551615Z
	
//======================================================================================================================================

// These macros must exactly match those in the Windows SDK's intsafe.h 
/*
#define INT8_MIN (-127i8 - 1)
#define INT16_MIN (-32767i16 - 1)
#define INT32_MIN (-2147483647i32 - 1)
#define INT64_MIN (-9223372036854775807i64 - 1)
#define INT8_MAX 127i8
#define INT16_MAX 32767i16
#define INT32_MAX 2147483647i32
#define INT64_MAX 9223372036854775807i64
#define UINT8_MAX 0xffui8
#define UINT16_MAX 0xffffui16
#define UINT32_MAX 0xffffffffui32
#define UINT64_MAX 0xffffffffffffffffui64

#define INT_LEAST8_MIN INT8_MIN
#define INT_LEAST16_MIN INT16_MIN
#define INT_LEAST32_MIN INT32_MIN
#define INT_LEAST64_MIN INT64_MIN
#define INT_LEAST8_MAX INT8_MAX
#define INT_LEAST16_MAX INT16_MAX
#define INT_LEAST32_MAX INT32_MAX
#define INT_LEAST64_MAX INT64_MAX
#define UINT_LEAST8_MAX UINT8_MAX
#define UINT_LEAST16_MAX UINT16_MAX
#define UINT_LEAST32_MAX UINT32_MAX
#define UINT_LEAST64_MAX UINT64_MAX

#define INT_FAST8_MIN INT8_MIN
#define INT_FAST16_MIN INT32_MIN
#define INT_FAST32_MIN INT32_MIN
#define INT_FAST64_MIN INT64_MIN
#define INT_FAST8_MAX INT8_MAX
#define INT_FAST16_MAX INT32_MAX
#define INT_FAST32_MAX INT32_MAX
#define INT_FAST64_MAX INT64_MAX
#define UINT_FAST8_MAX UINT8_MAX
#define UINT_FAST16_MAX UINT32_MAX
#define UINT_FAST32_MAX UINT32_MAX
#define UINT_FAST64_MAX UINT64_MAX

#ifdef _WIN64
#define INTPTR_MIN INT64_MIN
#define INTPTR_MAX INT64_MAX
#define UINTPTR_MAX UINT64_MAX
#else	[ _WIN64 ]
#define INTPTR_MIN INT32_MIN
#define INTPTR_MAX INT32_MAX
#define UINTPTR_MAX UINT32_MAX
#endif	[_WIN64 ]

#define INTMAX_MIN INT64_MIN
#define INTMAX_MAX INT64_MAX
#define UINTMAX_MAX UINT64_MAX

#define PTRDIFF_MIN INTPTR_MIN
#define PTRDIFF_MAX INTPTR_MAX

#ifndef SIZE_MAX
#define SIZE_MAX UINTPTR_MAX
#endif [ SIZE_MAX ]

#define SIG_ATOMIC_MIN INT32_MIN
#define SIG_ATOMIC_MAX INT32_MAX

#define WCHAR_MIN 0x0000
#define WCHAR_MAX 0xffff

#define WINT_MIN 0x0000
#define WINT_MAX 0xffff

#define INT8_C(x) (x)
#define INT16_C(x) (x)
#define INT32_C(x) (x)
#define INT64_C(x) (x ## LL)

#define UINT8_C(x) (x)
#define UINT16_C(x) (x)
#define UINT32_C(x) (x ## U)
#define UINT64_C(x) (x ## ULL)

#define INTMAX_C(x) INT64_C(x)
#define UINTMAX_C(x) UINT64_C(x) */