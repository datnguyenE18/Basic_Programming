.model

.stack 100h

.data 
    val1Dec dw 2
    val2Dec dw 4
    sumDec dw ?
    val1Hex dw 12h
    val2Hex dw 34h
    sumHex dw ?
    val1Bin dw 111b
    val2Bin dw 110b
    sumBin dw ?

.code
 main PROC
 
    MOV AX, data
    MOV DS, AX
 
    MOV AX, val1Dec
    ADD AX, val2Dec
    MOV sumDec, AX
 
    MOV BX, val1Hex
    ADD BX, val2Hex
    MOV sumHex, BX
 
    MOV CX, val1Bin
    ADD CX, val2Bin
    MOV sumBin, CX

    mov AX,04ch
    int 21h
 
main ENDP
end main