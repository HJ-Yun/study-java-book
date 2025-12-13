async function get1(bno){
    const result = await axios.get(`/api/replies/list/${bno}`)

//    console.log(result)

    return result.data

}