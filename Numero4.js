// A Multiplicação Inteira de n-bits recebe dois números inteiros x e y de n-bits e retorna o resutado de x * y.

// Assim, novamente:

// implemente o algortimo abaixo;
// teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
// O algoritmo está dado abaixo:

// MULTIPLY(x, y, n) 
//    IF (n = 1)
//       RETURN x * y.
//    ELSE
//       m ← ⎡ n / 2 ⎤.
//       a ← ⎣ x / 2^m ⎦; b ← x mod 2^m.
//       c ← ⎣ y / 2^m ⎦; d ← y mod 2^m.
//       e ← MULTIPLY(a, c, m).
//       f ← MULTIPLY(b, d, m).
//       g ← MULTIPLY(b, c, m).
//       h ← MULTIPLY(a, d, m).
//       RETURN 2^(2m)*e + 2^m*(g + h) + f.

function multiply (x, y, n) {
    cont++;

    if (n === 1) {
        return x * y;
    } else {
        let m = Math.floor(n / 2);
        let a = Math.floor(x / 2**m);
        let b = x % 2**m;
        let c = Math.floor(y / 2**m);
        let d = y % 2**m;
        let e = multiply(a, c, m);
        let f = multiply(b, d, m);
        let g = multiply(b, c, m);
        let h = multiply(a, d, m);
        return 2**(2*m)*e + 2**m*(g + h) + f;
    }
}

// Testes
var cont = 0;
let n = 4;
let x = 12;
let y = 12;
let start = new Date();
let result = multiply(x, y, n);
let end = new Date();
console.log(`Resultado: ${result}`);
console.log(`Tempo: ${end - start}ms`);
console.log(`Iterações: ${cont}`);