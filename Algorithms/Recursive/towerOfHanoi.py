def towerOfHanoi(n, fromPeg, toPeg, auxPeg) :
    if n == 1 :
        print "Move disk 1 from peg {0} to peg {1}".format(fromPeg, toPeg)
        return

    # Move top n-1 disk from A to B using Auxilary C
    towerOfHanoi(n - 1, fromPeg, auxPeg, toPeg)

    print  "Move disk {0}  from peg {1} to peg {2}".format(n, fromPeg, toPeg)

    # Move n-1 disk from B to C using A as aux
    towerOfHanoi(n - 1, auxPeg, toPeg, fromPeg)


towerOfHanoi(3, 'A', 'C', 'B')
