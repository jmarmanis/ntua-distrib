package beans;

/*
 * todo : Create different types of messages that will be sent
 * to handle any different cases
 */
public enum MessageType {
    IdRequest,
    IdResponse,
    PeerJoin,
    JoinAnswer,
    BalanceRequest,
    BalanceResponse,
    Ping,
    Pong,
    BlockMined,
    Stop
}
