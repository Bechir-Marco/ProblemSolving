class Solution {

    /**
     * @param String[] $words
     * @param String $chars
     * @return Integer
     */
     function countCharacters($words, $chars) {
    
    $splitedChars = array_count_values(str_split($chars,1) );
    $sum=0;
    foreach($words as $word): 
        $splitedWord = array_count_values(str_split($word,1));
        foreach($splitedWord as $key=> $val):
            $flag = true;
            if (!isset($splitedChars[$key]) || $splitedChars[$key]<$val):
            $flag=false;
            break;
            endif;
        endforeach;
        if ($flag)$sum+=strlen($word);
    endforeach;
    return $sum;
}
}