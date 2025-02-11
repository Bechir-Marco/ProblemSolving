class Solution {

    /**
     * @param String $address
     * @return String
     */
    function defangIPaddr($address) {
        $address = preg_replace('/\./',"[.]",$address);
        return $address;
    }
}