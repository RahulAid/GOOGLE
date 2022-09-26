read -p "Enter a value :" a
while [ $a -le 10 ]
do
        echo "$a";
        a=$(($a + 1));
done
