// PROGRAM TO CONVERT DECIMAL TO HEXADECIMAL
	   LXI H,2060
	   MOV A,M
	   ANI 0F
	   MOV C,A
	   MOV A,M
	   ANI F0
	   RLC
	   RLC
	   RLC
	   RLC
	   MOV B,A
	   STC
	   CMC
	   MVI E,09

L1:	   ADD B
	   DCR E
	   JNZ L1
	   ADD C
	   STA 2070
	   HLT
# ORG 2060H
# DB 16