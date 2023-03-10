fun main(args: Array<String>) {

    print("Введите строчку: ")
    val inp = readln()
    if (inp.length == 0) {
        print("Ошибочка, вы ввели пустую строчку..")
        return
    }
    var a = inp[0]
    var res = ""
    var n: Int = 0
    for (b in inp) {
        if (a != b) {
            res += a
            if (n != 1) {
                res += n.toString()
            }
            a = b
            n = 0
        }
        n++
    }
    res += a
    if (n != 1) {
        res += n.toString()
    }
    println(res)
}