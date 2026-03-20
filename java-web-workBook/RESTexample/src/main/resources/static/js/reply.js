async function get1(bno){
    const result = await axios.get(`/api/replies/list/${bno}`)
//    console.log(result)
    return result.data
}

async function getList({bno, page, size, goLast}){
   const result = await axios.get(`/api/replies/list/${bno}`,{params:{page,size}})

    if (goLast){
        const total = result.data.total
        const lastPage = parseInt(Math.ceil(total/size))
        return getList({bno:bno, page:lastPage, size: size})
    }
    return result.data
}

async function addReply(replyObj){
    const result = await axios.post(`/api/replies/`,replyObj)
    return result.data
}

async function getReply(rno){
    const result = await axios.get(`/api/replies/${rno}`)
    return result.data
}

async function modifyReply(replyObj){
    const result = await axios.put(`/api/replies/${replyObj.rno}`, replyObj)
    return result.data
}

async function removeReply(rno){
    const result = await axios.delete(`/api/replies/${rno}`)
    return result.data
}