package pl.allegro.tech.hermes.common.metric;

import static pl.allegro.tech.hermes.metrics.PathsCompiler.GROUP;
import static pl.allegro.tech.hermes.metrics.PathsCompiler.SUBSCRIPTION;
import static pl.allegro.tech.hermes.metrics.PathsCompiler.TOPIC;

public class Gauges {

    public static final String EVERYONE_CONFIRMS_BUFFER_TOTAL_BYTES = "everyone-confirms-buffer-total-bytes",
            EVERYONE_CONFIRMS_BUFFER_AVAILABLE_BYTES = "everyone-confirms-buffer-available-bytes",
            EVERYONE_CONFIRMS_COMPRESSION_RATE = "everyone-confirms-compression-rate-avg",
            LEADER_CONFIRMS_BUFFER_TOTAL_BYTES = "leader-confirms-buffer-total-bytes",
            LEADER_CONFIRMS_BUFFER_AVAILABLE_BYTES = "leader-confirms-buffer-available-bytes",
            LEADER_CONFIRMS_COMPRESSION_RATE = "leader-confirms-compression-rate-avg",
            BATCH_BUFFER_TOTAL_BYTES = "batch-buffer-total-bytes",
            BATCH_BUFFER_AVAILABLE_BYTES = "batch-buffer-available-bytes",
            JMX_PREFIX = "jmx",

            THREADS = "threads",
            INFLIGHT_REQUESTS = "inflight-requests",
            OUTPUT_RATE = "output-rate." + GROUP + "." + TOPIC + "." + SUBSCRIPTION,
            BACKUP_STORAGE_SIZE = "backup-storage.size",
            MAX_RATE_CALCULATION_DURATION = "consumers-rate.max-rate.coordinator.duration",
            MAX_RATE_VALUE =
                    "consumers-rate.max-rate.node." + GROUP + "." + TOPIC + "." + SUBSCRIPTION + ".max-rate",
            MAX_RATE_ACTUAL_RATE_VALUE =
                    "consumers-rate.max-rate.node." + GROUP + "." + TOPIC + "." + SUBSCRIPTION + ".rate",
            RUNNING_CONSUMER_PROCESSES_COUNT = "consumer-processes.running-consumer-processes.count",
            DYING_CONSUMER_PROCESSES_COUNT = "consumer-processes.dying-consumer-processes.count",
            CONSUMER_SENDER_REQUEST_QUEUE_SIZE = "consumer-sender-request-queue-size",
            CONSUMER_SENDER_HTTP_1_REQUEST_QUEUE_SIZE = "consumer-sender-http-1-request-queue-size",
            CONSUMER_SENDER_HTTP_2_REQUEST_QUEUE_SIZE = "consumer-sender-http-2-request-queue-size";
}
